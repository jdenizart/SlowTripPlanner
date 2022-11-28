import { TestBed } from '@angular/core/testing';

import { BaliseService } from './balise.service';

describe('BaliseService', () => {
  let service: BaliseService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(BaliseService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
