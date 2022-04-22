import os
import sys
import json

def main():
    args = sys.argv
    file = args[-1]
    with open(file, 'r') as f:
        contents = json.load(f)
        errors = []
    for dep in contents['dependencies']:
        result = os.system(f'pip install {dep}')
        if result != 0:
            errors.append(f'{dep} failed with error code {result}')
    
    if len(errors) == 0:
        print('Success')
    else:
        for err in errors:
            print(err)



if __name__ == '__main__':
    main()